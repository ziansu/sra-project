public deepdsl.cudnn.JCudaTensor forward_inference_running_variance(deepdsl.cudnn.JCudaTensor x, deepdsl.cudnn.JCudaTensor scale, deepdsl.cudnn.JCudaTensor bias) {
    deepdsl.cudnn.JCudaTensor y = new deepdsl.cudnn.JCudaTensor(x_dims);
    int ret = jcuda.jcudnn.JCudnn.cudnnBatchNormalizationForwardInference(cudnnHandle, deepdsl.cudnn.JCudnnBatchNorm.mode, one, zero, x_dptr.descriptor, x.getData(), x_dptr.descriptor, y.getData(), norm_dptr.descriptor, scale.getData(), bias.getData(), running_mean.getData(), running_variance.getData(), deepdsl.cudnn.JCudnnBatchNorm.epsilon);
    checkError(ret);
    return y;
}