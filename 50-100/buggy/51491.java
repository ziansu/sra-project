public void setUserSpinner() {
    blueprint.com.sage.models.User director = mSchool.getDirector();
    if (director == null)
        return ;
    
    for (int i = 0; i < (mUsers.size()); i++)
        if ((mUsers.get(i).getId()) == (director.getId()))
            mDirector.setSelection(i);
        
    
}