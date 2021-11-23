@java.lang.Override
public com.google.codeu.codingchallenge.JSON getObject(java.lang.String name) {
    return (list.get(name)) instanceof com.google.codeu.codingchallenge.JSON ? ((com.google.codeu.codingchallenge.JSON) (list.get(name))) : null;
}