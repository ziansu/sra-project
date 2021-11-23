@java.lang.Override
public void addChildren(io.github.zachohara.percussionpacker.cardentity.CardEntity parent, java.util.List<io.github.zachohara.percussionpacker.cardentity.CardEntity> children) {
    int parentIndex = this.createSpace(parent, 0, children, 1);
    for (int i = 0; i < (children.size()); i++) {
        this.add(((parentIndex + i) + 1), children.get(i));
    }
}