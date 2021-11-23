public void ensureCapacity(int capacity) {
    capacity = ((int) (java.lang.Math.ceil(((java.lang.Math.log(capacity)) / (java.lang.Math.log(2))))));
    if (capacity <= (contents.length))
        return ;
    
    io.github.endreman0.fishcraft.api.codebox.IFishStackable[] newContents = new io.github.endreman0.fishcraft.api.codebox.IFishStackable[capacity];
    java.lang.System.arraycopy(contents, 0, newContents, 0, size);
    this.contents = newContents;
}