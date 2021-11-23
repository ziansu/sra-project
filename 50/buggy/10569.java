protected boolean hasToRenderFormGroup(javax.faces.component.UIComponent component) {
    return (component.getParent()) instanceof net.bootsfaces.component.formGroup.FormGroup;
}