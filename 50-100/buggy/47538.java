public void setDesiredDimensions() {
    setDesiredWidth = 0;
    setDesiredHeight = 0;
    switch (selectedRadioButton) {
        case 1 :
            setDesiredWidth = RADIO_BUTTON_1_HEIGHT;
            setDesiredHeight = RADIO_BUTTON_1_WIDTH;
            break;
        case 2 :
            setDesiredWidth = RADIO_BUTTON_2_WIDTH;
            setDesiredHeight = RADIO_BUTTON_2_HEIGHT;
            break;
        case 3 :
            setDesiredWidth = RADIO_BUTTON_3_WIDTH;
            setDesiredHeight = RADIO_BUTTON_3_HEIGHT;
            break;
        case 4 :
            setDesiredWidth = RADIO_BUTTON_4_WIDTH;
            setDesiredHeight = RADIO_BUTTON_4_HEIGHT;
            break;
        default :
            setDesiredWidth = RADIO_BUTTON_3_WIDTH;
            setDesiredHeight = RADIO_BUTTON_3_HEIGHT;
            break;
    }
}