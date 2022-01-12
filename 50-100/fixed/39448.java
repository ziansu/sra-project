public boolean hasInRange(int target) {
    if ((((Entitymembership) - 1) & 2) != 2) {
        return ((EntityPositionX) + (EntityFirerange)) >= target;
    }else {
        return ((EntityPositionX) - (EntityFirerange)) <= target;
    }
}