public final int compare(net.named_data.jndn.Name.Component other) {
    if ((value_.size()) < (other.value_.size()))
        return -1;
    
    if ((value_.size()) > (other.value_.size()))
        return 1;
    
    return value_.compare(other.value_);
}