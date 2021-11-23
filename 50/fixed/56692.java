private int dofDrton(int n) {
    int dof = (((n - 2) * (n - 3)) / 2) - 2;
    if (dof < 1)
        dof = 1;
    
    return dof;
}