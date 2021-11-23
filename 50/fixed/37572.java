void fromAnywhereForObject(int level) throws java.io.IOException {
    downgradeToLevel(level);
    closeAllToLevel((level - 1));
}