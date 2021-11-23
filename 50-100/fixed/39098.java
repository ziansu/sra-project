@java.lang.Override
public void record(long id, long[] args) {
    uk.ac.man.cs.llvm.ir.module.records.MetadataRecord record = uk.ac.man.cs.llvm.ir.module.records.MetadataRecord.decode(id);
    switch (record) {
        case OLD_NODE :
            createOldNode(args);
            break;
        case OLD_FN_NODE :
            createOldFnNode();
            break;
        default :
            super.record(id, args);
            return ;
    }
    (idx)++;
}