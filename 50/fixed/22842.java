public int getPhoneWinmobPart() {
    return (phoneClicks) > 0 ? ((phoneWinmobClicks) * 100) / (phoneClicks) : 0;
}