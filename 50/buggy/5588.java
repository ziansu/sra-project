@java.lang.Override
public void save() {
    hair.userId = user_id;
    if ((suppressModals) != null)
        suppressModals.userId = user_id;
    
    super.save();
}