@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj == null)
        return false;
    
    if (obj == (this))
        return true;
    
    if ((obj.getClass()) == (this.getClass())) {
        return (this.id) == (((Person) (obj)).getId());
    }
}