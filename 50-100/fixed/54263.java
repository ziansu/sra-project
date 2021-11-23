@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    org.innovateuk.ifs.category.domain.CategoryLink<?, ?> that = ((org.innovateuk.ifs.category.domain.CategoryLink<?, ?>) (o));
    return new org.apache.commons.lang3.builder.EqualsBuilder().append(category, that.category).append(className, that.className).isEquals();
}