private static void step1AllocateRowPointers(jcuda.jcusparse.cusparseHandle handle, org.apache.sysml.runtime.instructions.gpu.context.JCudaObject.CSRPointer C, int rowsC) throws org.apache.sysml.runtime.DMLRuntimeException {
    jcuda.jcusparse.JCusparse.cusparseSetPointerMode(handle, cusparsePointerMode.CUSPARSE_POINTER_MODE_HOST);
    cudaDeviceSynchronize();
    C.rowPtr = org.apache.sysml.runtime.instructions.gpu.context.JCudaObject.allocate(org.apache.sysml.runtime.instructions.gpu.context.JCudaObject.getIntSizeOf((((long) (rowsC)) + 1)));
}