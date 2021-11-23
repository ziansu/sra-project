public org.springframework.format.Printer<?> getPrinter(org.springframework.samples.mvc.convert.MaskFormat annotation, java.lang.Class<?> fieldType) {
    return new org.springframework.samples.mvc.convert.MaskFormatAnnotationFormatterFactory.MaskFormatter(annotation.value());
}