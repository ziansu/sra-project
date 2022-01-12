public boolean isEmpty() {
    return !(rocnikovyprojekt.Sets.intersects(accessibleStates(), finalStates));
}