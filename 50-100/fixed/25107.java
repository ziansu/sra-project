public void addNotAvailableLanguages(org.springframework.ui.Model model) {
    java.util.List<ro.leje.model.Locale> notAvailablelocales = java.util.Arrays.asList(new ro.leje.model.Locale("DE", "DE", "Deutsch", true), new ro.leje.model.Locale("ES", "ES", "Español", true), new ro.leje.model.Locale("FR", "FR", "Français", true), new ro.leje.model.Locale("IT", "IT", "Italiano", true));
    model.addAttribute("notAvailableLocales", notAvailablelocales);
}