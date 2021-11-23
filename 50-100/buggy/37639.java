private void RightRotation() {
    RBTree.Node<K, V> y = Left;
    Left = y.Right;
    if (!(y.Right.Nil))
        y.Right.Root = this;
    
    y.Root = Root;
    if ((Root) == null) {
        T.setRoot(y);
        y.T = T;
        T = null;
    }else
        if ((this) == (Root.Right))
            Root.Right = y;
        else
            Root.Left = y;
        
    
    y.Right = this;
    Root = y;
}