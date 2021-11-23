public int add(BSTNode newNode) {
    if (newNode.dateOfBirth.isAfter(this.dateOfBirth)) {
        if ((left) == null) {
            left = newNode;
        }else
            return left.add(newNode);
        
    }else
        if (newNode.dateOfBirth.isBefore(this.dateOfBirth)) {
            if ((right) == null) {
                right = newNode;
            }else
                return right.add(newNode);
            
        }
    
    return BSTNode.counter;
}