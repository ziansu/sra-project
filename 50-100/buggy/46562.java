@java.lang.Override
public infographic.ExtraPart getHighestChild() {
    infographic.ExtraPart heighestChild = null;
    int height = 0;
    for (infographic.MainPart subPart : subParts) {
        infographic.ExtraPart child = subPart.getHighestChild();
        int childHeight = child.getImageHeight();
        if (childHeight > height) {
            heighestChild = child;
            height = childHeight;
        }
    }
    return heighestChild;
}