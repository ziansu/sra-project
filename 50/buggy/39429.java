public boolean IsCoreEmpty() {
    int[] temp = com.example.anthonykim.kim.Model.GameTableModel.getInstance().getTable();
    if ((temp[4]) != 0)
        return false;
    
    return true;
}