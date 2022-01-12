public boolean contains(Feature feature) {
    if ((head) == null)
        return false;
    else {
        FeatureNode current = head;
        while (current != null) {
            if (current.equals(feature))
                return true;
            
            current = current.getNext();
        } 
        return false;
    }
}