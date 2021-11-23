@java.lang.Override
public boolean contains(K id) {
    return (currentLevel.contains(id)) || (hasNextLevel() ? nextLevel.contains(id) : false);
}