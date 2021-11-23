public <BOOL> BOOL isFunction(org.mmaroti.sat.math.BoolAlg<BOOL> alg, org.mmaroti.sat.math.Tensor<BOOL> func) {
    func = org.mmaroti.sat.math.Tensor.fold(alg.ONE, 1, func);
    func = org.mmaroti.sat.math.Tensor.fold(alg.ALL, func.getOrder(), func);
    return func.get();
}