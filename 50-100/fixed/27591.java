@java.lang.Override
public boolean equals(java.lang.Object cat) {
    if ((this) == cat)
        return true;
    
    if (cat == null)
        return false;
    
    if ((this.getClass()) != (cat.getClass()))
        return false;
    
    com.shael.shah.expensemanager.Category category = ((com.shael.shah.expensemanager.Category) (cat));
    return (this.getType().equals(category.getType())) && ((this.getColor()) == (category.getColor()));
}