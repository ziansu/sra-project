private int getDrawableId(int type) {
    switch (type) {
        case pl.polsl.aeiimap.model.DataParser.TYP_AULA :
            return R.drawable.selector_button_blue;
        case pl.polsl.aeiimap.model.DataParser.TYP_LABORATORIUM :
            return R.drawable.selector_button_green;
        case pl.polsl.aeiimap.model.DataParser.TYP_SALA_CWICZEN :
            return R.drawable.selector_button_orange;
        case pl.polsl.aeiimap.model.DataParser.TYP_TOALETA :
            return R.drawable.selector_button_yellow;
        case pl.polsl.aeiimap.model.DataParser.TYP_POMIESZCZENIA_PRACOWNIKOW :
            return R.drawable.selector_button_pink;
        case pl.polsl.aeiimap.model.DataParser.TYP_POMIESZCZENIA_UZYTKOWE :
            return R.drawable.selector_button_turquoise;
        case pl.polsl.aeiimap.model.DataParser.TYP_UNDEFINED :
            return R.drawable.selector_button_red;
    }
    return R.drawable.selector_button_purple;
}