@java.lang.Override
public void removeChildren(io.github.zachohara.percussionpacker.cardentity.CardEntity parent, java.util.List<io.github.zachohara.percussionpacker.cardentity.CardEntity> children) {
    int parentIndex = this.createSpace(parent, children, (-1));
    for (int i = (children.size()) - 1; i >= 0; i--) {
        this.remove(((parentIndex + i) + 1));
    }
}