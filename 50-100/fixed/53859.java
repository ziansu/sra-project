@java.lang.Override
public int compareTo(models.Record other) {
    if (((this.created) != null) && ((other.created) != null)) {
        return -(this.created.compareTo(other.created));
    }else
        if (((this.created) == null) && ((other.created) == null)) {
            return super.compareTo(other);
        }else
            if ((this.created) == null)
                return 1;
            else
                return -1;
            
        
    
}