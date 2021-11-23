public boolean contains(dependency.ADependency funcDep) {
    for (dependency.ADependency df : this.df)
        if (df.equals(funcDep))
            return true;
        
    
    return false;
}