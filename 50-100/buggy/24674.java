public int getEndingIndex(int collisionCode, java.util.ArrayList<unit.Unit> u) {
    if (collisionCode == (CollisionConstants.CODE_LIST[((CollisionConstants.CODE_LIST.length) - 1)])) {
        return (u.size()) - 1;
    }
    return indexes[(collisionCode + 1)].get();
}