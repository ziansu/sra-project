public static void main(java.lang.String[] args) {
    try {
        if (!(no.difi.meldingsutveksling.IntegrasjonspunktApplication.validateJCE())) {
            no.difi.meldingsutveksling.IntegrasjonspunktApplication.logMissingJCE();
            return ;
        }
        org.springframework.context.ConfigurableApplicationContext context = org.springframework.boot.SpringApplication.run(no.difi.meldingsutveksling.IntegrasjonspunktApplication.class, args);
    } catch (java.lang.SecurityException se) {
        no.difi.meldingsutveksling.IntegrasjonspunktApplication.logMissingJCE(se);
    }
}