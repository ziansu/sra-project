@org.springframework.web.bind.annotation.RequestMapping(value = "/{deploymentId}/analysis", method = org.springframework.web.bind.annotation.RequestMethod.GET)
jp.ac.nii.prl.mape.autoscaling.analysis.model.Adaptation getAdaptation(@org.springframework.web.bind.annotation.PathVariable
java.lang.Integer deploymentId) {
    java.util.Optional<jp.ac.nii.prl.mape.autoscaling.analysis.model.Adaptation> adaptation = this.adaptationService.findByDeploymentId(deploymentId);
    if (adaptation.isPresent())
        return this.adaptationService.findByDeploymentId(deploymentId).get();
    
    throw new jp.ac.nii.prl.mape.autoscaling.analysis.controller.AdaptationNotFoundException(java.lang.String.format("No adaptation with deployment ID %s", deploymentId));
}