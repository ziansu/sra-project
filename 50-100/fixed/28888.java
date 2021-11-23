public static void install() {
    new java.io.File(io.github.demonstrablybad.translate.ocr.OCR.getTessDirectory()).mkdirs();
    new java.io.File(io.github.demonstrablybad.translate.ocr.OCR.getOCRDataDirectory()).mkdirs();
    new java.io.File(io.github.demonstrablybad.translate.ocr.OCR.getImageDirectory()).mkdirs();
    io.github.demonstrablybad.translate.ocr.OCR.downloadLanguage("eng");
    io.github.demonstrablybad.translate.ocr.OCR.downloadLanguage("spa");
}