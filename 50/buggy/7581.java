public boolean uncover() {
    if (uncovered)
        return false;
    
    uncovered = true;
    return (!(marked)) && ((count) == 0);
}