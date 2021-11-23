public void setAttenuation(float constant, float linear, float quadratic) {
    setFloat("attenuation_constant", constant);
    setFloat("attenuation_linear", constant);
    setFloat("attenuation_quadratic", quadratic);
}