@java.lang.Override
public fig.basic.LispTree toLispTree() {
    fig.basic.LispTree tree = LispTree.proto.newList();
    tree.addChild(getLabel());
    tree.addChild(person.toLispTree());
    tree.addChild(name.toLispTree());
    for (edu.stanford.nlp.sempre.thingtalk.ParamValue param : this.params)
        tree.addChild(param.toLispTree());
    
    return tree;
}