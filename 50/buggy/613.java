public java.util.Optional<java.lang.Double> getContribution() {
    return isContributionfree() ? java.util.Optional.of(0.0) : contribution;
}