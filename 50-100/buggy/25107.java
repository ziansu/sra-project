public void addNotAvailableLanguages(org.springframework.ui.Model model) {
    java.util.List<ro.leje.model.Locale> notAvailablelocales = java.util.Arrays.asList(new ro.leje.model.Locale("DE", "Deutsch", true), new ro.leje.model.Locale("ES", "Español", true), new ro.leje.model.Locale("FR", "Français", true), new ro.leje.model.Locale("IT", "Italiano", true));
    model.addAttribute("notAvailableLocales", notAvailablelocales);
}