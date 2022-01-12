@org.springframework.web.bind.annotation.RequestMapping
public java.lang.String list(org.springframework.data.domain.Pageable pageable, org.springframework.ui.Model uiModel) {
    org.springframework.data.domain.Page<com.appspot.gardemallorie.domain.Location> page = locationService.findAllLocations(pageable);
    uiModel.addAttribute("locations", page.getContent());
    uiModel.addAttribute("maxPages", page.getTotalPages());
    return "locations/list";
}