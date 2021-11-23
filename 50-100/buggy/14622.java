@java.lang.Override
public int getItemCount() {
    if (((header) == null) && ((footer) == null)) {
        return items.size();
    }else
        if ((header) == null) {
            return (items.size()) + 1;
        }else
            if ((footer) == null) {
                return (items.size()) + 1;
            }else {
                return (items.size()) + 2;
            }
        
    
}