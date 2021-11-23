private lesson3.BinaryTree.Node<T> find(lesson3.BinaryTree.Node<T> start, T value) {
    int comparison = value.compareTo(start.value);
    if (comparison == 0) {
        return start;
    }else
        if (comparison < 0) {
            if ((start.left) == null)
                return start;
            
            return find(start.left, value);
        }else {
            if ((start.right) == null)
                return start;
            
            return find(start.right, value);
        }
    
}