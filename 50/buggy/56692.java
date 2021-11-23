private int dofDrton(int n) {
    int dof = (((n - 2) * (n - 3)) / 2) - 2;
    if (dof < 0)
        dof = 0;
    
    return dof;
}