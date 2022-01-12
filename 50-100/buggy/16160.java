@java.lang.Override
public boolean equals(java.lang.Object other) {
    java.lang.System.out.println("equals was called hehe");
    if ((this) == other) {
        return true;
    }
    if (!(other instanceof com.mygdx.game.Item)) {
        return false;
    }
    com.mygdx.game.Item theOther = ((com.mygdx.game.Item) (other));
    return (theOther.uid) == (this.uid);
}