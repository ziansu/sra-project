public void expand(com.codename1.ui.Component body) {
    if (autoClose) {
        for (com.codename1.ui.Component cc : this) {
            com.codename1.components.Accordion.AccordionContent c = ((com.codename1.components.Accordion.AccordionContent) (cc));
            c.openClose((!(body == (c.body))));
        }
    }else {
        for (com.codename1.ui.Component cc : this) {
            com.codename1.components.Accordion.AccordionContent c = ((com.codename1.components.Accordion.AccordionContent) (cc));
            if (body == (c.body)) {
                c.openClose(false);
            }
        }
    }
}