private void validateAlgo(java.lang.String algo, org.springframework.validation.Errors errors) {
    if (!(("HSV".equals(algo)) || ("Rgb".equals(algo)))) {
        errors.rejectValue("algo", "NOT_A_VALID_ALGO", "La valeur de l'algorithm est invalide");
    }
}