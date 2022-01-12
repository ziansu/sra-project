private models.SubSection changeSection(models.SubSection section) {
    if (((section.getSubTimeStart().compare(fromTime)) >= 0) && ((checkEndTime) && ((section.getSubTimeEnd().compare(toTime)) <= 0))) {
        section.getSubTimeStart().changeTime(changeValue, anticipate);
        section.getSubTimeEnd().changeTime(changeValue, anticipate);
    }
    return section;
}