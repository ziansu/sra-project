public boolean isInitialized() {
    if ((((loc[0]) != (user_email)) != null) && (!(name.equals("Uninitialized")))) {
        setId((++(com.teamoptimal.cse110project.data.Restroom.currID)));
        return true;
    }else
        return false;
    
}