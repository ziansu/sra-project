@java.lang.Override
public void save() {
    if ((user_id) == null) {
        return ;
    }
    hair.userId = user_id;
    if ((suppressModals) != null)
        suppressModals.userId = user_id;
    
    super.save();
}