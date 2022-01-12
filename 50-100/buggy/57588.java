@java.lang.Override
public boolean hasNext() {
    java.lang.System.out.println(("Seq hasnext " + (this.index)));
    if ((index) < (this.phases.size())) {
        if (this.phases.get(index).hasNext()) {
            return true;
        }
        if ((index) != ((this.phases.size()) - 1))
            return true;
        
    }
    return false;
}