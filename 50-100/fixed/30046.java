@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    edu.sdsu.its.video_inv.Models.Category category = ((edu.sdsu.its.video_inv.Models.Category) (o));
    return (id.equals(category.id)) && (name.equals(category.name));
}