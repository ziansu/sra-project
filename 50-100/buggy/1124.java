public java.util.List<jumpingalien.model.Characters> getAllObjects() {
    java.util.LinkedList<jumpingalien.model.Characters> result = new java.util.LinkedList<jumpingalien.model.Characters>();
    for (int index = getNbObjects(); index <= 1; index--)
        result.addFirst(getObjectAt(index));
    
    return result;
}