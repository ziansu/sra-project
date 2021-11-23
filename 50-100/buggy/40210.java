public poly.datastructure.PolyNameNode getNameNode(int i) throws java.lang.IndexOutOfBoundsException {
    int size = getSize();
    if (i == 0)
        return firstNode;
    else
        if (i == (size - 1))
            return lastNode;
        else
            if ((i >= size) | (i < 0))
                throw new java.lang.IndexOutOfBoundsException();
            else {
                poly.datastructure.PolyNameNode current = firstNode;
                for (int j = 1; j < i; j++)
                    current = current.getDownPtr();
                
                return current;
            }
        
    
}