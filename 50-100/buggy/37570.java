public static int[] toArray(com.jntu.model.BSTNode node, int i, int[] arrayForm) {
    if (node == null)
        return arrayForm;
    
    arrayForm[i] = node.data;
    com.jntu.model.BSTNode.toArray(node.leftNode, ((2 * i) + 1), arrayForm);
    com.jntu.model.BSTNode.toArray(node.rightNode, ((2 * i) + 2), arrayForm);
    return arrayForm;
}