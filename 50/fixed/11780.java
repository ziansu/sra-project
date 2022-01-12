private static void step3AllocateValNInd(jcuda.jcusparse.cusparseHandle handle, org.apache.sysml.runtime.instructions.gpu.context.JCudaObject.CSRPointer C) throws org.apache.sysml.runtime.DMLRuntimeException {
    C.val = org.apache.sysml.runtime.instructions.gpu.context.JCudaObject.allocate(org.apache.sysml.runtime.instructions.gpu.context.JCudaObject.getDoubleSizeOf(C.nnz), 0);
    C.colInd = org.apache.sysml.runtime.instructions.gpu.context.JCudaObject.allocate(org.apache.sysml.runtime.instructions.gpu.context.JCudaObject.getIntSizeOf(C.nnz), 1);
}