@java.lang.Override
public void prepare() {
    if (isPrepared)
        return ;
    
    for (de.uniluebeck.sourcegen.c.CFun c : this.cfuns) {
        c.addParents(this.parents, this.getName());
    }
    for (de.uniluebeck.sourcegen.c.CppClass c : this.classes) {
        c.addParents(this.parents, this.getName());
    }
    isPrepared = true;
}